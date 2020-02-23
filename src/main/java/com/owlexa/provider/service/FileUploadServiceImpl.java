package com.owlexa.provider.service;

import com.owlexa.exception.FileStorageException;
import com.owlexa.exception.MyFileNotFoundException;
import com.owlexa.provider.model.FileUpload;
import com.owlexa.provider.repository.FileUploadRepository;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

public class FileUploadServiceImpl implements FileUploadService {
    @Autowired
    FileUploadRepository fileUploadRepository;

    @Override
    public FileUpload storeFile(MultipartFile file) {
        // Normalize file name
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            // Check if the file's name contains invalid characters
            if(fileName.contains("..")) {
                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
            }

            FileUpload dbFile = new FileUpload(fileName, file.getContentType(), file.getBytes());

            return fileUploadRepository.save(dbFile);
        } catch (IOException ex) {
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }
    }

    @Override
    public FileUpload getFile(String fileId) {
        return fileUploadRepository.findById(fileId)
            .orElseThrow(() -> new MyFileNotFoundException("File not found with id " + fileId));
    }
}

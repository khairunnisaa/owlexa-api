package com.owlexa.provider.service;

import com.owlexa.exception.ResourceNotFoundException;
import com.owlexa.provider.model.FileUpload;
import java.io.IOException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {

    public FileUpload storeFile(MultipartFile file);

    public FileUpload getFile(String fileId);
}

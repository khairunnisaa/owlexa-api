package com.owlexa.provider.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "DetailProvider")
public class DetailProvider {
    private long id;
    //provider
    private String providerName;
    private String providerCategory;
    private String address;
    private String city;
    private String province;
    private String country;
    private int postalCode;
    private String bankName;
    private String bankAccount;
    private String bankAccountName;
    private String npwp;
    private String tdp;
    private String suratIzinOps;
    private String softcopyTarif;
    private String suratIzinPenetapanKelas;
    private String softcopyObat;
    private String companyProfile;
    private String telelphone;
    private String fax;
    private String namaMarketing;
    private String telpMarketing;
    private String emailMarketing;
    private String namaFinance;
    private String telpFinance;
    private String emailFinance;
    private String namaIt;
    private String telpIt;
    private String emailIt;
    private String website;
    private String telpCp;
    private String longitude;
    private String latitude;
    private String jasaOwlexa;
    private String vip;
    private String kerjasamaBpjs;
    private String jaringanInet;
    private String diskon;
    private String kesepakatanHarga;
    private String sisfoRs;
    private boolean bersediaBridging;
    private boolean bersediaPksProses;
    private boolean suratKerjasamaOwlexa;

    public DetailProvider() {
    }

    public DetailProvider(String providerName,
        String providerCategory, String address,
        String city, String province, String country, int postalCode,
        String bankName, String bankAccount,
        String bankAccountName, String npwp, String tdp,
        String suratIzinOps, String softcopyTarif,
        String suratIzinPenetapanKelas,
        String softcopyObat, String companyProfile,
        String telelphone, String fax,
        String namaMarketing, String telpMarketing,
        String emailMarketing, String namaFinance,
        String telpFinance, String emailFinance,
        String namaIt, String telpIt, String emailIt,
        String website, String telpCp, String longitude,
        String latitude, String jasaOwlexa, String vip,
        String kerjasamaBpjs, String jaringanInet,
        String diskon, String kesepakatanHarga,
        String sisfoRs, boolean bersediaBridging, boolean bersediaPksProses,
        boolean suratKerjasamaOwlexa) {
        this.providerName = providerName;
        this.providerCategory = providerCategory;
        this.address = address;
        this.city = city;
        this.province = province;
        this.country = country;
        this.postalCode = postalCode;
        this.bankName = bankName;
        this.bankAccount = bankAccount;
        this.bankAccountName = bankAccountName;
        this.npwp = npwp;
        this.tdp = tdp;
        this.suratIzinOps = suratIzinOps;
        this.softcopyTarif = softcopyTarif;
        this.suratIzinPenetapanKelas = suratIzinPenetapanKelas;
        this.softcopyObat = softcopyObat;
        this.companyProfile = companyProfile;
        this.telelphone = telelphone;
        this.fax = fax;
        this.namaMarketing = namaMarketing;
        this.telpMarketing = telpMarketing;
        this.emailMarketing = emailMarketing;
        this.namaFinance = namaFinance;
        this.telpFinance = telpFinance;
        this.emailFinance = emailFinance;
        this.namaIt = namaIt;
        this.telpIt = telpIt;
        this.emailIt = emailIt;
        this.website = website;
        this.telpCp = telpCp;
        this.longitude = longitude;
        this.latitude = latitude;
        this.jasaOwlexa = jasaOwlexa;
        this.vip = vip;
        this.kerjasamaBpjs = kerjasamaBpjs;
        this.jaringanInet = jaringanInet;
        this.diskon = diskon;
        this.kesepakatanHarga = kesepakatanHarga;
        this.sisfoRs = sisfoRs;
        this.bersediaBridging = bersediaBridging;
        this.bersediaPksProses = bersediaPksProses;
        this.suratKerjasamaOwlexa = suratKerjasamaOwlexa;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "providerName")
    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    @Column(name = "providerCategory")
    public String getProviderCategory() {
        return providerCategory;
    }

    public void setProviderCategory(String providerCategory) {
        this.providerCategory = providerCategory;
    }

    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "province")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name = "postalCode")
    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Column(name = "bankName")
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Column(name = "bankAccount")
    public String getBankAccount() {
        return bankAccount;
    }


    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Column(name = "bankAccountName")
    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    @Column(name = "npwp")
    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    @Column(name = "tdp")
    public String getTdp() {
        return tdp;
    }

    public void setTdp(String tdp) {
        this.tdp = tdp;
    }

    @Column(name = "suratIzinOps")
    public String getSuratIzinOps() {
        return suratIzinOps;
    }

    public void setSuratIzinOps(String suratIzinOps) {
        this.suratIzinOps = suratIzinOps;
    }

    @Column(name = "softcopyTarif")
    public String getSoftcopyTarif() {
        return softcopyTarif;
    }

    public void setSoftcopyTarif(String softcopyTarif) {
        this.softcopyTarif = softcopyTarif;
    }

    @Column(name = "suratIzinPenetapanKelas")
    public String getSuratIzinPenetapanKelas() {
        return suratIzinPenetapanKelas;
    }

    public void setSuratIzinPenetapanKelas(
        String suratIzinPenetapanKelas) {
        this.suratIzinPenetapanKelas = suratIzinPenetapanKelas;
    }

    @Column(name = "softCopyObat")
    public String getSoftcopyObat() {
        return softcopyObat;
    }


    public void setSoftcopyObat(String softcopyObat) {
        this.softcopyObat = softcopyObat;
    }

    @Column(name = "companyProfile")
    public String getCompanyProfile() {
        return companyProfile;
    }

    public void setCompanyProfile(String companyProfile) {
        this.companyProfile = companyProfile;
    }

    @Column(name = "telephone")
    public String getTelelphone() {
        return telelphone;
    }

    public void setTelelphone(String telelphone) {
        this.telelphone = telelphone;
    }

    @Column(name = "fax")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Column(name = "namaMarketing")
    public String getNamaMarketing() {
        return namaMarketing;
    }

    public void setNamaMarketing(String namaMarketing) {
        this.namaMarketing = namaMarketing;
    }

    @Column(name = "telpMarketing")
    public String getTelpMarketing() {
        return telpMarketing;
    }

    public void setTelpMarketing(String telpMarketing) {
        this.telpMarketing = telpMarketing;
    }

    @Column(name = "emailMarketing")
    public String getEmailMarketing() {
        return emailMarketing;
    }

    public void setEmailMarketing(String emailMarketing) {
        this.emailMarketing = emailMarketing;
    }

    @Column(name = "namaFinance")
    public String getNamaFinance() {
        return namaFinance;
    }

    public void setNamaFinance(String namaFinance) {
        this.namaFinance = namaFinance;
    }

    @Column(name = "telpFinance")
    public String getTelpFinance() {
        return telpFinance;
    }

    public void setTelpFinance(String telpFinance) {
        this.telpFinance = telpFinance;
    }

    @Column(name = "emailFinance")
    public String getEmailFinance() {
        return emailFinance;
    }

    public void setEmailFinance(String emailFinance) {
        this.emailFinance = emailFinance;
    }

    @Column(name = "namaIt")
    public String getNamaIt() {
        return namaIt;
    }

    public void setNamaIt(String namaIt) {
        this.namaIt = namaIt;
    }

    @Column(name = "telpIt")
    public String getTelpIt() {
        return telpIt;
    }

    public void setTelpIt(String telpIt) {
        this.telpIt = telpIt;
    }

    @Column(name = "emailIt")
    public String getEmailIt() {
        return emailIt;
    }

    public void setEmailIt(String emailIt) {
        this.emailIt = emailIt;
    }

    @Column(name = "website")
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Column(name = "telpCp")
    public String getTelpCp() {
        return telpCp;
    }

    public void setTelpCp(String telpCp) {
        this.telpCp = telpCp;
    }

    @Column(name = "longitude")
    public String getLongitude() {
        return longitude;
    }


    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Column(name = "latitude")
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Column(name = "jasaOwlexa")
    public String getJasaOwlexa() {
        return jasaOwlexa;
    }

    public void setJasaOwlexa(String jasaOwlexa) {
        this.jasaOwlexa = jasaOwlexa;
    }

    @Column(name = "vip")
    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    @Column(name = "kerjasamabpjs")
    public String getKerjasamaBpjs() {
        return kerjasamaBpjs;
    }

    public void setKerjasamaBpjs(String kerjasamaBpjs) {
        this.kerjasamaBpjs = kerjasamaBpjs;
    }

    @Column(name = "jaringanInet")
    public String getJaringanInet() {
        return jaringanInet;
    }

    public void setJaringanInet(String jaringanInet) {
        this.jaringanInet = jaringanInet;
    }

    @Column(name = "diskon")
    public String getDiskon() {
        return diskon;
    }

    public void setDiskon(String diskon) {
        this.diskon = diskon;
    }

    @Column(name = "kesepakatanHarga")
    public String getKesepakatanHarga() {
        return kesepakatanHarga;
    }

    public void setKesepakatanHarga(String kesepakatanHarga) {
        this.kesepakatanHarga = kesepakatanHarga;
    }

    @Column(name = "sisfoRs")
    public String getSisfoRs() {
        return sisfoRs;
    }

    public void setSisfoRs(String sisfoRs) {
        this.sisfoRs = sisfoRs;
    }

    @Column(name = "bersediaBridging")
    public boolean isBersediaBridging() {
        return bersediaBridging;
    }

    public void setBersediaBridging(boolean bersediaBridging) {
        this.bersediaBridging = bersediaBridging;
    }

    @Column(name = "bersediaPks")
    public boolean isBersediaPksProses() {
        return bersediaPksProses;
    }

    public void setBersediaPksProses(boolean bersediaPksProses) {
        this.bersediaPksProses = bersediaPksProses;
    }

    @Column(name = "suratKerjasamOwlexa")
    public boolean isSuratKerjasamaOwlexa() {
        return suratKerjasamaOwlexa;
    }

    public void setSuratKerjasamaOwlexa(boolean suratKerjasamaOwlexa) {
        this.suratKerjasamaOwlexa = suratKerjasamaOwlexa;
    }
}

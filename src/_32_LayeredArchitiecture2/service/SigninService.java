package _32_LayeredArchitiecture2.service;


import _32_LayeredArchitiecture2.dto.SigninReqDto;

public interface SigninService {
    void signin(SigninReqDto signinReqDto);
    boolean isEmpty(String str);
}

package _32_LayeredArchitiecture2;

import _32_LayeredArchitiecture2.dto.SignupReqDto;
import _32_LayeredArchitiecture2.service.SignupService;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        SignupService signupService = SignupService.getInstance();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("[회원 관리 시스템]");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 가입된 회원 전체 조회");
            System.out.println("q. 종료");
            System.out.println(" >>> ");
            String selectedMenu = scanner.nextLine();

            if ("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("프로그램 종료 중 ...");
                break;
            } else if ("1".equals(selectedMenu)) {
                System.out.println("[화원가입]");
                SignupReqDto signupReqDto = new SignupReqDto();
                while (true) {
                    System.out.print("Username: ");
                    signupReqDto.setUsername(scanner.nextLine());
                    if (signupService.isValidDuplicatedUsername(signupReqDto.getUsername())){
                        break;
                    }
                    System.out.println("이미 사용중인 Username입니다.");
                }
                //아이디 중복확인
                //비밀번호 유효성 체크
                while (true){
                    System.out.println("비밀번호: ");
                    signupReqDto.setPassword(scanner.nextLine());
                    if (signupService.isValidPassword(signupReqDto.getPassword())){
                        break;
                    }
                    System.out.println("비밀번호는 공백일 수 없습니다. 다시 입력하세요!");
                }

                //비밀번호와 비밀번호 확인 같은지 체크
                while (true){
                    System.out.println("비밀번호 일치 합니다!");
                    signupReqDto.setPassword(scanner.nextLine());

                    if (signupService.isValidConfirmPassword(signupReqDto.getPassword(), signupReqDto.getConfirmPassword())){
                        break;
                    }
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요 ");
                }

                signupService.signup(signupReqDto);
                System.out.println("[회원가입 완료]");

            } else if ("2".equals(selectedMenu)) {
                System.out.println("[로그인]");
            } else if ("3".equals(selectedMenu)) {
                System.out.println("[가입된 회원 전체 조회]");
            } else{
                System.out.println("다시 선택 하십시오..");
            }
        }
        System.out.println("프로그램 종료 완료!");
    }
}

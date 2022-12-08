package poo_simulado_q1.src;

import java.time.LocalDate;

public class VerifiedUser {
    private LocalDate verificationDate;

    public VerifiedUser(LocalDate verificationDate){
        this.verificationDate = verificationDate;
    }
    public VerifiedUser(){
        this.verificationDate = null;
    }

    public LocalDate getVerificationDate() {
        return verificationDate;
    }

    public void setVerificationDate(LocalDate verificationDate) {
        this.verificationDate = verificationDate;
    }
}

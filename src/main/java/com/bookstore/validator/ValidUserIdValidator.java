package com.bookstore.validator;
import com.bookstore.entity.User;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User>{
    @Override
    public boolean isValid(User user, ConstraintValidatorContext constraintValidatorContext){
        return user!=null && user.getId() !=null;
    }
}

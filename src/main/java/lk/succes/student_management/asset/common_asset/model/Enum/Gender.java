package lk.succes.student_management.asset.common_asset.model.Enum;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Gender {
    MALE("Male"),
    FEMALE("Female");

    private final String gender;
}

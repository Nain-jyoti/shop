package com.example.shoppingverse.dto.RequestDto;

import com.example.shoppingverse.Enum.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class CustomerRequestDto {

    String name;

    String emailId;

    String mobileNo;

    Gender gender;

}
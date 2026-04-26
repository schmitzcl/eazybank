package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Schema(
    name = "Customer",
    description = "Schema to hold a Customer and Account information"
)
@Data
public class CustomerDto {

    @Schema(
        description = "Name of the customer", example = "Claude Schmitz"
    )
    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 5, max = 30, message = "Name should be between 2 and 30 characters")
    private String name;

    @Schema(
        description = "Email of the customer", example = "name@mail.com"
    )
    @NotEmpty(message = "Email address cannot be null or empty")
    @Email(message = "Email address is not valid")
    private String email;

    @Schema(
        description = "Mobile Number of the customer", example = "9345432123"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(
        description = "Account details of the customer"
    )
    private AccountsDto accountsDto;
}

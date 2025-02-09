package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Schema(name = "Accounts", description = "Schema to hold Account information")
@Data
public class AccountsDto {

    @NotEmpty(message = "Account number cannot be empty")
    @Pattern(regexp = "^[0-9]{10}$", message = "Account number must be 10 digits")
    @Schema(description = "Account number of the customer", example = "1234567890")
    private Long accountNumber;

    @NotEmpty(message = "Account type cannot be empty")
    @Schema(description = "Account type of the customer", example = "savings")
    private String accountType;

    @NotEmpty(message = "Branch address cannot be empty")
    @Schema(description = "Branch address of the customer's bank", example = "401_E_72nd_St,_Kansas_City,_Missouri,_76234")
    private String branchAddress;

}

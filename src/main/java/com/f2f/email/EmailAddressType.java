package com.f2f.email;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.revengemission.sso.oauth2.server.domain.BaseDomain;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data
public class EmailAddressType  extends BaseDomain {
    private String id;
    private String name ;
    private String description;
}

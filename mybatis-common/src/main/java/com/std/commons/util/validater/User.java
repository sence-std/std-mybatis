package com.std.commons.util.validater;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

 
public class User implements Serializable {
	private static final long serialVersionUID = -2109557426455148798L;

	@NotNull(message = "{user.id.null}")
    private Long id;

    @NotEmpty(message = "{user.name.null}")
    @Length(min = 5, max = 20, message = "{user.name.length.illegal}")
    @Pattern(regexp = "[a-zA-Z]{5,20}", message = "{user.name.illegal}")
    private String name;

    @NotNull(message = "{user.password.null}")
    private String password;
}
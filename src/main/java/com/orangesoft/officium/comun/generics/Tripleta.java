package com.orangesoft.officium.comun.generics;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public abstract class Tripleta <X,Y,Z>{
    X firstElement;
    Y secondElement;
    Z thirdElement;
}

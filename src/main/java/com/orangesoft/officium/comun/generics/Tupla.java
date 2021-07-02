package com.orangesoft.officium.comun.generics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Tupla<K,V> {
    K firstElement;
    V secondElement;
}

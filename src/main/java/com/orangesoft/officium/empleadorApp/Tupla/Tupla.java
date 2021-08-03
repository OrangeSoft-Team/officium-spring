package com.orangesoft.officium.empleadorApp.Tupla;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public abstract class Tupla<K,V> {
    K firstElement;
    V secondElement;
}

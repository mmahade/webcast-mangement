package com.wtv.webcastmanagement.entity.legacy.sysText;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Entries{
    String id;
    List<Texts> texts;
}
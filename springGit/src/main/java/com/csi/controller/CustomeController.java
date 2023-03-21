package com.csi.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@AllArgsConstructor
@NoArgsConstructor
 class Vehicle{
  private  int custId;
  private  String custName;
  private double custSalary;

}
@RestController
@RequestMapping("/v1")
public class CustomeController {
 @GetMapping("/vehical")
 public ResponseEntity<List<Vehicle>> getData(){
  return ResponseEntity.ok(Stream.of(new Vehicle(11,"swara",45000),new Vehicle(12,"ram",58000)).collect(Collectors.toList()));
 }
}

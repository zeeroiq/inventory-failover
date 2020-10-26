/*
 * Created by zeeroiq on 10/27/20, 12:52 AM
 */

package com.zeeroiq.inventoryfailover.web;

import com.zeeroiq.inventoryfailover.model.InventoryDto;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Component
public class InventoryHandler {

    public Mono<ServerResponse> listInventory(ServerRequest request) {

        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_STREAM_JSON)
                .body(Mono.just(Arrays.asList(InventoryDto.builder()
                        .id(UUID.randomUUID())
                        .beerId(UUID.fromString("00000000-0000-0000-0000-000000000000"))
                        .quantityOnHand(9999)
                        .createdOn(OffsetDateTime.now())
                        .modifiedOn(OffsetDateTime.now())
                        .build())), List.class);
    }
}

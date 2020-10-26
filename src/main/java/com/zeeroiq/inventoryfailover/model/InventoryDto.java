/*
 * Created by zeeroiq on 10/26/20, 8:23 PM
 */

package com.zeeroiq.inventoryfailover.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InventoryDto implements Serializable {

    private static final long serialVersionUID = -3785235674480574018L;

    private UUID id;
    private OffsetDateTime createdOn;
    private OffsetDateTime modifiedOn;
    private UUID beerId;
    private Integer quantityOnHand;
    
}

// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreatedResponseLabelsBetweenObjectPairTest {

    @Test
    fun create() {
        val createdResponseLabelsBetweenObjectPair =
            CreatedResponseLabelsBetweenObjectPair.builder()
                .createdResourceId("createdResourceId")
                .entity(
                    LabelsBetweenObjectPair.builder()
                        .fromObjectId("fromObjectId")
                        .fromObjectTypeId("fromObjectTypeId")
                        .addLabel("string")
                        .toObjectId("toObjectId")
                        .toObjectTypeId("toObjectTypeId")
                        .build()
                )
                .location("location")
                .build()

        assertThat(createdResponseLabelsBetweenObjectPair.createdResourceId())
            .isEqualTo("createdResourceId")
        assertThat(createdResponseLabelsBetweenObjectPair.entity())
            .isEqualTo(
                LabelsBetweenObjectPair.builder()
                    .fromObjectId("fromObjectId")
                    .fromObjectTypeId("fromObjectTypeId")
                    .addLabel("string")
                    .toObjectId("toObjectId")
                    .toObjectTypeId("toObjectTypeId")
                    .build()
            )
        assertThat(createdResponseLabelsBetweenObjectPair.location()).contains("location")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createdResponseLabelsBetweenObjectPair =
            CreatedResponseLabelsBetweenObjectPair.builder()
                .createdResourceId("createdResourceId")
                .entity(
                    LabelsBetweenObjectPair.builder()
                        .fromObjectId("fromObjectId")
                        .fromObjectTypeId("fromObjectTypeId")
                        .addLabel("string")
                        .toObjectId("toObjectId")
                        .toObjectTypeId("toObjectTypeId")
                        .build()
                )
                .location("location")
                .build()

        val roundtrippedCreatedResponseLabelsBetweenObjectPair =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createdResponseLabelsBetweenObjectPair),
                jacksonTypeRef<CreatedResponseLabelsBetweenObjectPair>(),
            )

        assertThat(roundtrippedCreatedResponseLabelsBetweenObjectPair)
            .isEqualTo(createdResponseLabelsBetweenObjectPair)
    }
}

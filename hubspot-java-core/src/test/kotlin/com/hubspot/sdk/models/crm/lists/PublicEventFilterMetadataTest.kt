// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicEventFilterMetadataTest {

    @Test
    fun create() {
        val publicEventFilterMetadata =
            PublicEventFilterMetadata.builder()
                .operation(
                    PublicBoolPropertyOperation.builder()
                        .includeObjectsWithNoValueSet(true)
                        .operationType(PublicBoolPropertyOperation.OperationType.BOOL)
                        .operator("operator")
                        .value(true)
                        .build()
                )
                .property("property")
                .build()

        assertThat(publicEventFilterMetadata.operation())
            .isEqualTo(
                PublicEventFilterMetadata.Operation.ofPublicBoolProperty(
                    PublicBoolPropertyOperation.builder()
                        .includeObjectsWithNoValueSet(true)
                        .operationType(PublicBoolPropertyOperation.OperationType.BOOL)
                        .operator("operator")
                        .value(true)
                        .build()
                )
            )
        assertThat(publicEventFilterMetadata.property()).isEqualTo("property")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicEventFilterMetadata =
            PublicEventFilterMetadata.builder()
                .operation(
                    PublicBoolPropertyOperation.builder()
                        .includeObjectsWithNoValueSet(true)
                        .operationType(PublicBoolPropertyOperation.OperationType.BOOL)
                        .operator("operator")
                        .value(true)
                        .build()
                )
                .property("property")
                .build()

        val roundtrippedPublicEventFilterMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicEventFilterMetadata),
                jacksonTypeRef<PublicEventFilterMetadata>(),
            )

        assertThat(roundtrippedPublicEventFilterMetadata).isEqualTo(publicEventFilterMetadata)
    }
}

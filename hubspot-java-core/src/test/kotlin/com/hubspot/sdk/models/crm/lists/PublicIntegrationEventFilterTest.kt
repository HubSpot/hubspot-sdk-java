// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicIntegrationEventFilterTest {

    @Test
    fun create() {
        val publicIntegrationEventFilter =
            PublicIntegrationEventFilter.builder()
                .eventTypeId(0)
                .addFilterLine(
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
                )
                .filterType(PublicIntegrationEventFilter.FilterType.INTEGRATION_EVENT)
                .build()

        assertThat(publicIntegrationEventFilter.eventTypeId()).isEqualTo(0)
        assertThat(publicIntegrationEventFilter.filterLines())
            .containsExactly(
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
            )
        assertThat(publicIntegrationEventFilter.filterType())
            .isEqualTo(PublicIntegrationEventFilter.FilterType.INTEGRATION_EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicIntegrationEventFilter =
            PublicIntegrationEventFilter.builder()
                .eventTypeId(0)
                .addFilterLine(
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
                )
                .filterType(PublicIntegrationEventFilter.FilterType.INTEGRATION_EVENT)
                .build()

        val roundtrippedPublicIntegrationEventFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicIntegrationEventFilter),
                jacksonTypeRef<PublicIntegrationEventFilter>(),
            )

        assertThat(roundtrippedPublicIntegrationEventFilter).isEqualTo(publicIntegrationEventFilter)
    }
}

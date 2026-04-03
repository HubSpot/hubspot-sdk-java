// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks.webhooksubscriptions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FilterResponseTest {

    @Test
    fun create() {
        val filterResponse =
            FilterResponse.builder()
                .id(0L)
                .createdAt(0L)
                .filter(
                    Filter.builder()
                        .addCondition(
                            Condition.builder()
                                .filterType(Condition.FilterType.CRM_OBJECT_PROPERTY)
                                .operator(Condition.Operator.CONTAINS)
                                .property("property")
                                .value("value")
                                .addValue("string")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(filterResponse.id()).isEqualTo(0L)
        assertThat(filterResponse.createdAt()).isEqualTo(0L)
        assertThat(filterResponse.filter())
            .isEqualTo(
                Filter.builder()
                    .addCondition(
                        Condition.builder()
                            .filterType(Condition.FilterType.CRM_OBJECT_PROPERTY)
                            .operator(Condition.Operator.CONTAINS)
                            .property("property")
                            .value("value")
                            .addValue("string")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val filterResponse =
            FilterResponse.builder()
                .id(0L)
                .createdAt(0L)
                .filter(
                    Filter.builder()
                        .addCondition(
                            Condition.builder()
                                .filterType(Condition.FilterType.CRM_OBJECT_PROPERTY)
                                .operator(Condition.Operator.CONTAINS)
                                .property("property")
                                .value("value")
                                .addValue("string")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedFilterResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(filterResponse),
                jacksonTypeRef<FilterResponse>(),
            )

        assertThat(roundtrippedFilterResponse).isEqualTo(filterResponse)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FilterCreateRequestTest {

    @Test
    fun create() {
        val filterCreateRequest =
            FilterCreateRequest.builder()
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
                .subscriptionId(0L)
                .build()

        assertThat(filterCreateRequest.filter())
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
        assertThat(filterCreateRequest.subscriptionId()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val filterCreateRequest =
            FilterCreateRequest.builder()
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
                .subscriptionId(0L)
                .build()

        val roundtrippedFilterCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(filterCreateRequest),
                jacksonTypeRef<FilterCreateRequest>(),
            )

        assertThat(roundtrippedFilterCreateRequest).isEqualTo(filterCreateRequest)
    }
}

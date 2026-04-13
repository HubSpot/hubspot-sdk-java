// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.exports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import com.hubspot.models.crm.Filter
import com.hubspot.models.crm.FilterGroup
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicCrmSearchRequestTest {

    @Test
    fun create() {
        val publicCrmSearchRequest =
            PublicCrmSearchRequest.builder()
                .addFilterGroup(
                    FilterGroup.builder()
                        .addFilter(
                            Filter.builder()
                                .operator(Filter.Operator.BETWEEN)
                                .propertyName("propertyName")
                                .highValue("highValue")
                                .value("value")
                                .addValue("string")
                                .build()
                        )
                        .build()
                )
                .addFilter(
                    Filter.builder()
                        .operator(Filter.Operator.BETWEEN)
                        .propertyName("propertyName")
                        .highValue("highValue")
                        .value("value")
                        .addValue("string")
                        .build()
                )
                .addSort("string")
                .query("query")
                .build()

        assertThat(publicCrmSearchRequest.filterGroups())
            .containsExactly(
                FilterGroup.builder()
                    .addFilter(
                        Filter.builder()
                            .operator(Filter.Operator.BETWEEN)
                            .propertyName("propertyName")
                            .highValue("highValue")
                            .value("value")
                            .addValue("string")
                            .build()
                    )
                    .build()
            )
        assertThat(publicCrmSearchRequest.filters())
            .containsExactly(
                Filter.builder()
                    .operator(Filter.Operator.BETWEEN)
                    .propertyName("propertyName")
                    .highValue("highValue")
                    .value("value")
                    .addValue("string")
                    .build()
            )
        assertThat(publicCrmSearchRequest.sorts()).containsExactly("string")
        assertThat(publicCrmSearchRequest.query()).contains("query")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicCrmSearchRequest =
            PublicCrmSearchRequest.builder()
                .addFilterGroup(
                    FilterGroup.builder()
                        .addFilter(
                            Filter.builder()
                                .operator(Filter.Operator.BETWEEN)
                                .propertyName("propertyName")
                                .highValue("highValue")
                                .value("value")
                                .addValue("string")
                                .build()
                        )
                        .build()
                )
                .addFilter(
                    Filter.builder()
                        .operator(Filter.Operator.BETWEEN)
                        .propertyName("propertyName")
                        .highValue("highValue")
                        .value("value")
                        .addValue("string")
                        .build()
                )
                .addSort("string")
                .query("query")
                .build()

        val roundtrippedPublicCrmSearchRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicCrmSearchRequest),
                jacksonTypeRef<PublicCrmSearchRequest>(),
            )

        assertThat(roundtrippedPublicCrmSearchRequest).isEqualTo(publicCrmSearchRequest)
    }
}

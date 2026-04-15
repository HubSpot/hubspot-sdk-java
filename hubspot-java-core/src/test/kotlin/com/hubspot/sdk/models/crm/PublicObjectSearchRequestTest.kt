// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicObjectSearchRequestTest {

    @Test
    fun create() {
        val publicObjectSearchRequest =
            PublicObjectSearchRequest.builder()
                .after("after")
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
                .limit(0)
                .addProperty("string")
                .addSort("string")
                .query("query")
                .build()

        assertThat(publicObjectSearchRequest.after()).isEqualTo("after")
        assertThat(publicObjectSearchRequest.filterGroups())
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
        assertThat(publicObjectSearchRequest.limit()).isEqualTo(0)
        assertThat(publicObjectSearchRequest.properties()).containsExactly("string")
        assertThat(publicObjectSearchRequest.sorts()).containsExactly("string")
        assertThat(publicObjectSearchRequest.query()).contains("query")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicObjectSearchRequest =
            PublicObjectSearchRequest.builder()
                .after("after")
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
                .limit(0)
                .addProperty("string")
                .addSort("string")
                .query("query")
                .build()

        val roundtrippedPublicObjectSearchRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicObjectSearchRequest),
                jacksonTypeRef<PublicObjectSearchRequest>(),
            )

        assertThat(roundtrippedPublicObjectSearchRequest).isEqualTo(publicObjectSearchRequest)
    }
}

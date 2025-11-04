// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
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
                                .operator(Filter.Operator.EQ)
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
                .query("query")
                .addSort("string")
                .build()

        assertThat(publicObjectSearchRequest.after()).contains("after")
        assertThat(publicObjectSearchRequest.filterGroups().getOrNull())
            .containsExactly(
                FilterGroup.builder()
                    .addFilter(
                        Filter.builder()
                            .operator(Filter.Operator.EQ)
                            .propertyName("propertyName")
                            .highValue("highValue")
                            .value("value")
                            .addValue("string")
                            .build()
                    )
                    .build()
            )
        assertThat(publicObjectSearchRequest.limit()).contains(0)
        assertThat(publicObjectSearchRequest.properties().getOrNull()).containsExactly("string")
        assertThat(publicObjectSearchRequest.query()).contains("query")
        assertThat(publicObjectSearchRequest.sorts().getOrNull()).containsExactly("string")
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
                                .operator(Filter.Operator.EQ)
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
                .query("query")
                .addSort("string")
                .build()

        val roundtrippedPublicObjectSearchRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicObjectSearchRequest),
                jacksonTypeRef<PublicObjectSearchRequest>(),
            )

        assertThat(roundtrippedPublicObjectSearchRequest).isEqualTo(publicObjectSearchRequest)
    }
}

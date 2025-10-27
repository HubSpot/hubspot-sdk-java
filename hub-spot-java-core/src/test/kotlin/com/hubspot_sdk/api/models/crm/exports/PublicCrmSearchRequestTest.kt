// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.exports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.crm.Filter
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicCrmSearchRequestTest {

    @Test
    fun create() {
        val publicCrmSearchRequest =
            PublicCrmSearchRequest.builder()
                .addFilter(
                    Filter.builder()
                        .operator(Filter.Operator.EQ)
                        .propertyName("")
                        .highValue("")
                        .value("")
                        .addValue("string")
                        .build()
                )
                .query("query")
                .addSort("string")
                .build()

        assertThat(publicCrmSearchRequest.filters())
            .containsExactly(
                Filter.builder()
                    .operator(Filter.Operator.EQ)
                    .propertyName("")
                    .highValue("")
                    .value("")
                    .addValue("string")
                    .build()
            )
        assertThat(publicCrmSearchRequest.query()).isEqualTo("query")
        assertThat(publicCrmSearchRequest.sorts()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicCrmSearchRequest =
            PublicCrmSearchRequest.builder()
                .addFilter(
                    Filter.builder()
                        .operator(Filter.Operator.EQ)
                        .propertyName("")
                        .highValue("")
                        .value("")
                        .addValue("string")
                        .build()
                )
                .query("query")
                .addSort("string")
                .build()

        val roundtrippedPublicCrmSearchRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicCrmSearchRequest),
                jacksonTypeRef<PublicCrmSearchRequest>(),
            )

        assertThat(roundtrippedPublicCrmSearchRequest).isEqualTo(publicCrmSearchRequest)
    }
}

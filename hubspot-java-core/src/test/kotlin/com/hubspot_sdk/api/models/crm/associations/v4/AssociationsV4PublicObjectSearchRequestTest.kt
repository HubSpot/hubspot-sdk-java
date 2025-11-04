// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.crm.Filter
import com.hubspot_sdk.api.models.crm.FilterGroup
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationsV4PublicObjectSearchRequestTest {

    @Test
    fun create() {
        val associationsV4PublicObjectSearchRequest =
            AssociationsV4PublicObjectSearchRequest.builder()
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
                .addSort("string")
                .query("query")
                .build()

        assertThat(associationsV4PublicObjectSearchRequest.after()).isEqualTo("after")
        assertThat(associationsV4PublicObjectSearchRequest.filterGroups())
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
        assertThat(associationsV4PublicObjectSearchRequest.limit()).isEqualTo(0)
        assertThat(associationsV4PublicObjectSearchRequest.properties()).containsExactly("string")
        assertThat(associationsV4PublicObjectSearchRequest.sorts()).containsExactly("string")
        assertThat(associationsV4PublicObjectSearchRequest.query()).contains("query")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val associationsV4PublicObjectSearchRequest =
            AssociationsV4PublicObjectSearchRequest.builder()
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
                .addSort("string")
                .query("query")
                .build()

        val roundtrippedAssociationsV4PublicObjectSearchRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associationsV4PublicObjectSearchRequest),
                jacksonTypeRef<AssociationsV4PublicObjectSearchRequest>(),
            )

        assertThat(roundtrippedAssociationsV4PublicObjectSearchRequest)
            .isEqualTo(associationsV4PublicObjectSearchRequest)
    }
}

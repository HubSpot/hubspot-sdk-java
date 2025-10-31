// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.commercepayments

import com.hubspot_sdk.api.models.crm.Filter
import com.hubspot_sdk.api.models.crm.FilterGroup
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommercePaymentSearchParamsTest {

    @Test
    fun create() {
        CommercePaymentSearchParams.builder()
            .publicObjectSearchRequest(
                PublicObjectSearchRequest.builder()
                    .after("after")
                    .addFilterGroup(
                        FilterGroup.builder()
                            .addFilter(
                                Filter.builder()
                                    .operator(Filter.Operator.EQ)
                                    .propertyName("")
                                    .highValue("")
                                    .value("")
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CommercePaymentSearchParams.builder()
                .publicObjectSearchRequest(
                    PublicObjectSearchRequest.builder()
                        .after("after")
                        .addFilterGroup(
                            FilterGroup.builder()
                                .addFilter(
                                    Filter.builder()
                                        .operator(Filter.Operator.EQ)
                                        .propertyName("")
                                        .highValue("")
                                        .value("")
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicObjectSearchRequest.builder()
                    .after("after")
                    .addFilterGroup(
                        FilterGroup.builder()
                            .addFilter(
                                Filter.builder()
                                    .operator(Filter.Operator.EQ)
                                    .propertyName("")
                                    .highValue("")
                                    .value("")
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CommercePaymentSearchParams.builder()
                .publicObjectSearchRequest(PublicObjectSearchRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(PublicObjectSearchRequest.builder().build())
    }
}

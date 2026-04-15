// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.objects.discounts

import com.hubspot.sdk.models.crm.Filter
import com.hubspot.sdk.models.crm.FilterGroup
import com.hubspot.sdk.models.crm.PublicObjectSearchRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DiscountSearchParamsTest {

    @Test
    fun create() {
        DiscountSearchParams.builder()
            .publicObjectSearchRequest(
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            DiscountSearchParams.builder()
                .publicObjectSearchRequest(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DiscountSearchParams.builder()
                .publicObjectSearchRequest(
                    PublicObjectSearchRequest.builder()
                        .after("after")
                        .addFilterGroup(
                            FilterGroup.builder()
                                .addFilter(
                                    Filter.builder()
                                        .operator(Filter.Operator.BETWEEN)
                                        .propertyName("propertyName")
                                        .build()
                                )
                                .build()
                        )
                        .limit(0)
                        .addProperty("string")
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
                                    .operator(Filter.Operator.BETWEEN)
                                    .propertyName("propertyName")
                                    .build()
                            )
                            .build()
                    )
                    .limit(0)
                    .addProperty("string")
                    .addSort("string")
                    .build()
            )
    }
}

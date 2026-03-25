// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.companies

import com.hubspot_sdk.api.models.crm.Filter
import com.hubspot_sdk.api.models.crm.FilterGroup
import com.hubspot_sdk.api.models.crm.objects.PublicObjectSearchRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanySearchParamsTest {

    @Test
    fun create() {
        CompanySearchParams.builder()
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
            CompanySearchParams.builder()
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
            CompanySearchParams.builder()
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

// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiEnrolledArgumentPropertyFilterDataSourceTest {

    @Test
    fun create() {
        val apiEnrolledArgumentPropertyFilterDataSource =
            ApiEnrolledArgumentPropertyFilterDataSource.builder()
                .argumentName("argumentName")
                .name("name")
                .propertyName("propertyName")
                .type(
                    ApiEnrolledArgumentPropertyFilterDataSource.Type
                        .ENROLLED_ARGUMENT_PROPERTY_FILTER
                )
                .sortBy(
                    ApiSort.builder()
                        .order(ApiSort.Order.ASC)
                        .property("property")
                        .missing("missing")
                        .build()
                )
                .build()

        assertThat(apiEnrolledArgumentPropertyFilterDataSource.argumentName())
            .isEqualTo("argumentName")
        assertThat(apiEnrolledArgumentPropertyFilterDataSource.name()).isEqualTo("name")
        assertThat(apiEnrolledArgumentPropertyFilterDataSource.propertyName())
            .isEqualTo("propertyName")
        assertThat(apiEnrolledArgumentPropertyFilterDataSource.type())
            .isEqualTo(
                ApiEnrolledArgumentPropertyFilterDataSource.Type.ENROLLED_ARGUMENT_PROPERTY_FILTER
            )
        assertThat(apiEnrolledArgumentPropertyFilterDataSource.sortBy())
            .contains(
                ApiSort.builder()
                    .order(ApiSort.Order.ASC)
                    .property("property")
                    .missing("missing")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiEnrolledArgumentPropertyFilterDataSource =
            ApiEnrolledArgumentPropertyFilterDataSource.builder()
                .argumentName("argumentName")
                .name("name")
                .propertyName("propertyName")
                .type(
                    ApiEnrolledArgumentPropertyFilterDataSource.Type
                        .ENROLLED_ARGUMENT_PROPERTY_FILTER
                )
                .sortBy(
                    ApiSort.builder()
                        .order(ApiSort.Order.ASC)
                        .property("property")
                        .missing("missing")
                        .build()
                )
                .build()

        val roundtrippedApiEnrolledArgumentPropertyFilterDataSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiEnrolledArgumentPropertyFilterDataSource),
                jacksonTypeRef<ApiEnrolledArgumentPropertyFilterDataSource>(),
            )

        assertThat(roundtrippedApiEnrolledArgumentPropertyFilterDataSource)
            .isEqualTo(apiEnrolledArgumentPropertyFilterDataSource)
    }
}

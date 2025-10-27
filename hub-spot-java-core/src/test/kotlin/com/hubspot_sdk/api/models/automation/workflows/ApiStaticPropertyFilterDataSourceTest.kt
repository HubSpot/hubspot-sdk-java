// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiStaticPropertyFilterDataSourceTest {

    @Test
    fun create() {
        val apiStaticPropertyFilterDataSource =
            ApiStaticPropertyFilterDataSource.builder()
                .name("name")
                .propertyName("propertyName")
                .staticValue("staticValue")
                .type(ApiStaticPropertyFilterDataSource.Type.STATIC_PROPERTY_FILTER)
                .sortBy(
                    ApiSort.builder()
                        .order(ApiSort.Order.ASC)
                        .property("property")
                        .missing("missing")
                        .build()
                )
                .build()

        assertThat(apiStaticPropertyFilterDataSource.name()).isEqualTo("name")
        assertThat(apiStaticPropertyFilterDataSource.propertyName()).isEqualTo("propertyName")
        assertThat(apiStaticPropertyFilterDataSource.staticValue()).isEqualTo("staticValue")
        assertThat(apiStaticPropertyFilterDataSource.type())
            .isEqualTo(ApiStaticPropertyFilterDataSource.Type.STATIC_PROPERTY_FILTER)
        assertThat(apiStaticPropertyFilterDataSource.sortBy())
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
        val apiStaticPropertyFilterDataSource =
            ApiStaticPropertyFilterDataSource.builder()
                .name("name")
                .propertyName("propertyName")
                .staticValue("staticValue")
                .type(ApiStaticPropertyFilterDataSource.Type.STATIC_PROPERTY_FILTER)
                .sortBy(
                    ApiSort.builder()
                        .order(ApiSort.Order.ASC)
                        .property("property")
                        .missing("missing")
                        .build()
                )
                .build()

        val roundtrippedApiStaticPropertyFilterDataSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiStaticPropertyFilterDataSource),
                jacksonTypeRef<ApiStaticPropertyFilterDataSource>(),
            )

        assertThat(roundtrippedApiStaticPropertyFilterDataSource)
            .isEqualTo(apiStaticPropertyFilterDataSource)
    }
}

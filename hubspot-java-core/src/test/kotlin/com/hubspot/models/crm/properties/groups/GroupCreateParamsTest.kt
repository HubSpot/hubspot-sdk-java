// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.properties.groups

import com.hubspot.models.PropertyGroupCreate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupCreateParamsTest {

    @Test
    fun create() {
        GroupCreateParams.builder()
            .objectType("objectType")
            .propertyGroupCreate(
                PropertyGroupCreate.builder().label("label").name("name").displayOrder(0).build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            GroupCreateParams.builder()
                .objectType("objectType")
                .propertyGroupCreate(
                    PropertyGroupCreate.builder().label("label").name("name").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            GroupCreateParams.builder()
                .objectType("objectType")
                .propertyGroupCreate(
                    PropertyGroupCreate.builder()
                        .label("label")
                        .name("name")
                        .displayOrder(0)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PropertyGroupCreate.builder().label("label").name("name").displayOrder(0).build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            GroupCreateParams.builder()
                .objectType("objectType")
                .propertyGroupCreate(
                    PropertyGroupCreate.builder().label("label").name("name").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(PropertyGroupCreate.builder().label("label").name("name").build())
    }
}

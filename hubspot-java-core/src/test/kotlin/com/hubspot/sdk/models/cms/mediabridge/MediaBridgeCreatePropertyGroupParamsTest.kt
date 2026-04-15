// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.hubspot.sdk.models.PropertyGroupCreate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeCreatePropertyGroupParamsTest {

    @Test
    fun create() {
        MediaBridgeCreatePropertyGroupParams.builder()
            .appId(0)
            .objectType("objectType")
            .propertyGroupCreate(
                PropertyGroupCreate.builder().label("label").name("name").displayOrder(0).build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MediaBridgeCreatePropertyGroupParams.builder()
                .appId(0)
                .objectType("objectType")
                .propertyGroupCreate(
                    PropertyGroupCreate.builder().label("label").name("name").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MediaBridgeCreatePropertyGroupParams.builder()
                .appId(0)
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
            MediaBridgeCreatePropertyGroupParams.builder()
                .appId(0)
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

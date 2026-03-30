// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.hubspot_sdk.api.models.PropertyGroupUpdate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeUpdatePropertyGroupParamsTest {

    @Test
    fun create() {
        MediaBridgeUpdatePropertyGroupParams.builder()
            .appId(0)
            .objectType("objectType")
            .groupName("groupName")
            .propertyGroupUpdate(
                PropertyGroupUpdate.builder().displayOrder(0).label("label").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MediaBridgeUpdatePropertyGroupParams.builder()
                .appId(0)
                .objectType("objectType")
                .groupName("groupName")
                .propertyGroupUpdate(PropertyGroupUpdate.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("objectType")
        assertThat(params._pathParam(2)).isEqualTo("groupName")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MediaBridgeUpdatePropertyGroupParams.builder()
                .appId(0)
                .objectType("objectType")
                .groupName("groupName")
                .propertyGroupUpdate(
                    PropertyGroupUpdate.builder().displayOrder(0).label("label").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(PropertyGroupUpdate.builder().displayOrder(0).label("label").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MediaBridgeUpdatePropertyGroupParams.builder()
                .appId(0)
                .objectType("objectType")
                .groupName("groupName")
                .propertyGroupUpdate(PropertyGroupUpdate.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(PropertyGroupUpdate.builder().build())
    }
}

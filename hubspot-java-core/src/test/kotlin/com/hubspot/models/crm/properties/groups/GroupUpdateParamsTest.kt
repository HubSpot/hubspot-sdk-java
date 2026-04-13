// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.properties.groups

import com.hubspot.models.PropertyGroupUpdate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupUpdateParamsTest {

    @Test
    fun create() {
        GroupUpdateParams.builder()
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
            GroupUpdateParams.builder()
                .objectType("objectType")
                .groupName("groupName")
                .propertyGroupUpdate(PropertyGroupUpdate.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        assertThat(params._pathParam(1)).isEqualTo("groupName")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            GroupUpdateParams.builder()
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
            GroupUpdateParams.builder()
                .objectType("objectType")
                .groupName("groupName")
                .propertyGroupUpdate(PropertyGroupUpdate.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(PropertyGroupUpdate.builder().build())
    }
}

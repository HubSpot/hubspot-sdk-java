// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.contacts

import com.hubspot_sdk.api.models.crm.objects.PublicGdprDeleteInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactGdprDeleteParamsTest {

    @Test
    fun create() {
        ContactGdprDeleteParams.builder()
            .objectType("objectType")
            .publicGdprDeleteInput(
                PublicGdprDeleteInput.builder()
                    .objectId("objectId")
                    .idProperty("idProperty")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ContactGdprDeleteParams.builder()
                .objectType("objectType")
                .publicGdprDeleteInput(PublicGdprDeleteInput.builder().objectId("objectId").build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ContactGdprDeleteParams.builder()
                .objectType("objectType")
                .publicGdprDeleteInput(
                    PublicGdprDeleteInput.builder()
                        .objectId("objectId")
                        .idProperty("idProperty")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicGdprDeleteInput.builder()
                    .objectId("objectId")
                    .idProperty("idProperty")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ContactGdprDeleteParams.builder()
                .objectType("objectType")
                .publicGdprDeleteInput(PublicGdprDeleteInput.builder().objectId("objectId").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(PublicGdprDeleteInput.builder().objectId("objectId").build())
    }
}

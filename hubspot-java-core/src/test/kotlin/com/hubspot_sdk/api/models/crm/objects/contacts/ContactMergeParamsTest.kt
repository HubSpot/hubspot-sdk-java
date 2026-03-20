// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.contacts

import com.hubspot_sdk.api.models.crm.objects.PublicMergeInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactMergeParamsTest {

    @Test
    fun create() {
        ContactMergeParams.builder()
            .objectType("objectType")
            .publicMergeInput(
                PublicMergeInput.builder()
                    .objectIdToMerge("objectIdToMerge")
                    .primaryObjectId("primaryObjectId")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ContactMergeParams.builder()
                .objectType("objectType")
                .publicMergeInput(
                    PublicMergeInput.builder()
                        .objectIdToMerge("objectIdToMerge")
                        .primaryObjectId("primaryObjectId")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ContactMergeParams.builder()
                .objectType("objectType")
                .publicMergeInput(
                    PublicMergeInput.builder()
                        .objectIdToMerge("objectIdToMerge")
                        .primaryObjectId("primaryObjectId")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicMergeInput.builder()
                    .objectIdToMerge("objectIdToMerge")
                    .primaryObjectId("primaryObjectId")
                    .build()
            )
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.threads

import com.hubspot_sdk.api.models.conversations.PublicThreadUpdateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadUpdateParamsTest {

    @Test
    fun create() {
        ThreadUpdateParams.builder()
            .threadId("threadId")
            .publicThreadUpdateRequest(
                PublicThreadUpdateRequest.builder()
                    .archived(true)
                    .status(PublicThreadUpdateRequest.Status.OPEN)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ThreadUpdateParams.builder()
                .threadId("threadId")
                .publicThreadUpdateRequest(PublicThreadUpdateRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("threadId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ThreadUpdateParams.builder()
                .threadId("threadId")
                .publicThreadUpdateRequest(
                    PublicThreadUpdateRequest.builder()
                        .archived(true)
                        .status(PublicThreadUpdateRequest.Status.OPEN)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicThreadUpdateRequest.builder()
                    .archived(true)
                    .status(PublicThreadUpdateRequest.Status.OPEN)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ThreadUpdateParams.builder()
                .threadId("threadId")
                .publicThreadUpdateRequest(PublicThreadUpdateRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(PublicThreadUpdateRequest.builder().build())
    }
}

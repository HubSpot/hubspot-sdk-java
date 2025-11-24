// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.threads

import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.conversations.PublicThreadUpdateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadUpdateParamsTest {

    @Test
    fun create() {
        ThreadUpdateParams.builder()
            .threadId(0L)
            .queryArchived(true)
            .publicThreadUpdateRequest(
                PublicThreadUpdateRequest.builder()
                    .archived(true)
                    .status(PublicThreadUpdateRequest.Status.CLOSED)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ThreadUpdateParams.builder()
                .threadId(0L)
                .publicThreadUpdateRequest(PublicThreadUpdateRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ThreadUpdateParams.builder()
                .threadId(0L)
                .queryArchived(true)
                .publicThreadUpdateRequest(
                    PublicThreadUpdateRequest.builder()
                        .archived(true)
                        .status(PublicThreadUpdateRequest.Status.CLOSED)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("archived", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ThreadUpdateParams.builder()
                .threadId(0L)
                .publicThreadUpdateRequest(PublicThreadUpdateRequest.builder().build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            ThreadUpdateParams.builder()
                .threadId(0L)
                .queryArchived(true)
                .publicThreadUpdateRequest(
                    PublicThreadUpdateRequest.builder()
                        .archived(true)
                        .status(PublicThreadUpdateRequest.Status.CLOSED)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicThreadUpdateRequest.builder()
                    .archived(true)
                    .status(PublicThreadUpdateRequest.Status.CLOSED)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ThreadUpdateParams.builder()
                .threadId(0L)
                .publicThreadUpdateRequest(PublicThreadUpdateRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(PublicThreadUpdateRequest.builder().build())
    }
}

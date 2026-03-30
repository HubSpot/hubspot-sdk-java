// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.listings

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListingUpdateParamsTest {

    @Test
    fun create() {
        ListingUpdateParams.builder()
            .listingId("listingId")
            .idProperty("idProperty")
            .simplePublicObjectInput(
                SimplePublicObjectInput.builder()
                    .properties(
                        SimplePublicObjectInput.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ListingUpdateParams.builder()
                .listingId("listingId")
                .simplePublicObjectInput(
                    SimplePublicObjectInput.builder()
                        .properties(
                            SimplePublicObjectInput.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("listingId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ListingUpdateParams.builder()
                .listingId("listingId")
                .idProperty("idProperty")
                .simplePublicObjectInput(
                    SimplePublicObjectInput.builder()
                        .properties(
                            SimplePublicObjectInput.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("idProperty", "idProperty").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ListingUpdateParams.builder()
                .listingId("listingId")
                .simplePublicObjectInput(
                    SimplePublicObjectInput.builder()
                        .properties(
                            SimplePublicObjectInput.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            ListingUpdateParams.builder()
                .listingId("listingId")
                .idProperty("idProperty")
                .simplePublicObjectInput(
                    SimplePublicObjectInput.builder()
                        .properties(
                            SimplePublicObjectInput.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SimplePublicObjectInput.builder()
                    .properties(
                        SimplePublicObjectInput.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ListingUpdateParams.builder()
                .listingId("listingId")
                .simplePublicObjectInput(
                    SimplePublicObjectInput.builder()
                        .properties(
                            SimplePublicObjectInput.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SimplePublicObjectInput.builder()
                    .properties(
                        SimplePublicObjectInput.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }
}

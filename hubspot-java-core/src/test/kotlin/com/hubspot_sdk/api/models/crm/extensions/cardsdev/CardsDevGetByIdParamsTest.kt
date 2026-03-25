// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.cardsdev

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardsDevGetByIdParamsTest {

    @Test
    fun create() {
        CardsDevGetByIdParams.builder().appId(0).cardId("cardId").build()
    }

    @Test
    fun pathParams() {
        val params = CardsDevGetByIdParams.builder().appId(0).cardId("cardId").build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("cardId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}

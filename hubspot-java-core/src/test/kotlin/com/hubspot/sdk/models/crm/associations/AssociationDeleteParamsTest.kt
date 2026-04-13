// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.associations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationDeleteParamsTest {

    @Test
    fun create() {
        AssociationDeleteParams.builder()
            .objectType("objectType")
            .objectId("objectId")
            .toObjectType("toObjectType")
            .toObjectId("toObjectId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AssociationDeleteParams.builder()
                .objectType("objectType")
                .objectId("objectId")
                .toObjectType("toObjectType")
                .toObjectId("toObjectId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        assertThat(params._pathParam(1)).isEqualTo("objectId")
        assertThat(params._pathParam(2)).isEqualTo("toObjectType")
        assertThat(params._pathParam(3)).isEqualTo("toObjectId")
        // out-of-bound path param
        assertThat(params._pathParam(4)).isEqualTo("")
    }
}

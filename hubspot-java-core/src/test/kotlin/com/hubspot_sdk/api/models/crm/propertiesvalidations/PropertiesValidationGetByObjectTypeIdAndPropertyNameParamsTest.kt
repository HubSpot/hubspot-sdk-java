// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.propertiesvalidations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertiesValidationGetByObjectTypeIdAndPropertyNameParamsTest {

    @Test
    fun create() {
        PropertiesValidationGetByObjectTypeIdAndPropertyNameParams.builder()
            .objectTypeId("objectTypeId")
            .propertyName("propertyName")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PropertiesValidationGetByObjectTypeIdAndPropertyNameParams.builder()
                .objectTypeId("objectTypeId")
                .propertyName("propertyName")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectTypeId")
        assertThat(params._pathParam(1)).isEqualTo("propertyName")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}

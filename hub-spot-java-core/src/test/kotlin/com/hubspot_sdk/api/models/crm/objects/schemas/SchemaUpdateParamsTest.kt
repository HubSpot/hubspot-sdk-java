// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.schemas

import com.hubspot_sdk.api.models.ObjectTypeDefinitionLabels
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SchemaUpdateParamsTest {

    @Test
    fun create() {
        SchemaUpdateParams.builder()
            .objectType("objectType")
            .objectTypeDefinitionPatch(
                ObjectTypeDefinitionPatch.builder()
                    .clearDescription(true)
                    .description("description")
                    .labels(
                        ObjectTypeDefinitionLabels.builder()
                            .plural("plural")
                            .singular("singular")
                            .build()
                    )
                    .primaryDisplayProperty("my_object_property")
                    .addRequiredProperty("my_object_property")
                    .restorable(true)
                    .addSearchableProperty("my_object_property")
                    .addSecondaryDisplayProperty("string")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SchemaUpdateParams.builder()
                .objectType("objectType")
                .objectTypeDefinitionPatch(ObjectTypeDefinitionPatch.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SchemaUpdateParams.builder()
                .objectType("objectType")
                .objectTypeDefinitionPatch(
                    ObjectTypeDefinitionPatch.builder()
                        .clearDescription(true)
                        .description("description")
                        .labels(
                            ObjectTypeDefinitionLabels.builder()
                                .plural("plural")
                                .singular("singular")
                                .build()
                        )
                        .primaryDisplayProperty("my_object_property")
                        .addRequiredProperty("my_object_property")
                        .restorable(true)
                        .addSearchableProperty("my_object_property")
                        .addSecondaryDisplayProperty("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ObjectTypeDefinitionPatch.builder()
                    .clearDescription(true)
                    .description("description")
                    .labels(
                        ObjectTypeDefinitionLabels.builder()
                            .plural("plural")
                            .singular("singular")
                            .build()
                    )
                    .primaryDisplayProperty("my_object_property")
                    .addRequiredProperty("my_object_property")
                    .restorable(true)
                    .addSearchableProperty("my_object_property")
                    .addSecondaryDisplayProperty("string")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SchemaUpdateParams.builder()
                .objectType("objectType")
                .objectTypeDefinitionPatch(ObjectTypeDefinitionPatch.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(ObjectTypeDefinitionPatch.builder().build())
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyTest {

    @Test
    fun create() {
        val property =
            Property.builder()
                .description("")
                .fieldType("select")
                .groupName("my_object_information")
                .label("My object property")
                .name("my_object_property")
                .addOption(
                    Option.builder()
                        .description("Choice number one")
                        .displayOrder(1)
                        .doubleData(0.0)
                        .hidden(false)
                        .label("Option A")
                        .readOnly(false)
                        .value("A")
                        .build()
                )
                .addOption(
                    Option.builder()
                        .description("Choice number two")
                        .displayOrder(2)
                        .doubleData(0.0)
                        .hidden(false)
                        .label("Option B")
                        .readOnly(false)
                        .value("B")
                        .build()
                )
                .type("enumeration")
                .archived(false)
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .calculated(false)
                .calculationFormula("")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdUserId("")
                .dataSensitivity(Property.DataSensitivity.NON_SENSITIVE)
                .displayOrder(2)
                .externalOptions(false)
                .formField(false)
                .hasUniqueValue(false)
                .hidden(false)
                .hubspotDefined(false)
                .modificationMetadata(
                    PropertyModificationMetadata.builder()
                        .archivable(true)
                        .readOnlyDefinition(false)
                        .readOnlyValue(false)
                        .readOnlyOptions(false)
                        .build()
                )
                .referencedObjectType("")
                .addSensitiveDataCategory("string")
                .showCurrencySymbol(false)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedUserId("updatedUserId")
                .build()

        assertThat(property.description()).isEqualTo("")
        assertThat(property.fieldType()).isEqualTo("select")
        assertThat(property.groupName()).isEqualTo("my_object_information")
        assertThat(property.label()).isEqualTo("My object property")
        assertThat(property.name()).isEqualTo("my_object_property")
        assertThat(property.options())
            .containsExactly(
                Option.builder()
                    .description("Choice number one")
                    .displayOrder(1)
                    .doubleData(0.0)
                    .hidden(false)
                    .label("Option A")
                    .readOnly(false)
                    .value("A")
                    .build(),
                Option.builder()
                    .description("Choice number two")
                    .displayOrder(2)
                    .doubleData(0.0)
                    .hidden(false)
                    .label("Option B")
                    .readOnly(false)
                    .value("B")
                    .build(),
            )
        assertThat(property.type()).isEqualTo("enumeration")
        assertThat(property.archived()).contains(false)
        assertThat(property.archivedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(property.calculated()).contains(false)
        assertThat(property.calculationFormula()).contains("")
        assertThat(property.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(property.createdUserId()).contains("")
        assertThat(property.dataSensitivity()).contains(Property.DataSensitivity.NON_SENSITIVE)
        assertThat(property.displayOrder()).contains(2)
        assertThat(property.externalOptions()).contains(false)
        assertThat(property.formField()).contains(false)
        assertThat(property.hasUniqueValue()).contains(false)
        assertThat(property.hidden()).contains(false)
        assertThat(property.hubspotDefined()).contains(false)
        assertThat(property.modificationMetadata())
            .contains(
                PropertyModificationMetadata.builder()
                    .archivable(true)
                    .readOnlyDefinition(false)
                    .readOnlyValue(false)
                    .readOnlyOptions(false)
                    .build()
            )
        assertThat(property.referencedObjectType()).contains("")
        assertThat(property.sensitiveDataCategories().getOrNull()).containsExactly("string")
        assertThat(property.showCurrencySymbol()).contains(false)
        assertThat(property.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(property.updatedUserId()).contains("updatedUserId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val property =
            Property.builder()
                .description("")
                .fieldType("select")
                .groupName("my_object_information")
                .label("My object property")
                .name("my_object_property")
                .addOption(
                    Option.builder()
                        .description("Choice number one")
                        .displayOrder(1)
                        .doubleData(0.0)
                        .hidden(false)
                        .label("Option A")
                        .readOnly(false)
                        .value("A")
                        .build()
                )
                .addOption(
                    Option.builder()
                        .description("Choice number two")
                        .displayOrder(2)
                        .doubleData(0.0)
                        .hidden(false)
                        .label("Option B")
                        .readOnly(false)
                        .value("B")
                        .build()
                )
                .type("enumeration")
                .archived(false)
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .calculated(false)
                .calculationFormula("")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdUserId("")
                .dataSensitivity(Property.DataSensitivity.NON_SENSITIVE)
                .displayOrder(2)
                .externalOptions(false)
                .formField(false)
                .hasUniqueValue(false)
                .hidden(false)
                .hubspotDefined(false)
                .modificationMetadata(
                    PropertyModificationMetadata.builder()
                        .archivable(true)
                        .readOnlyDefinition(false)
                        .readOnlyValue(false)
                        .readOnlyOptions(false)
                        .build()
                )
                .referencedObjectType("")
                .addSensitiveDataCategory("string")
                .showCurrencySymbol(false)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedUserId("updatedUserId")
                .build()

        val roundtrippedProperty =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(property),
                jacksonTypeRef<Property>(),
            )

        assertThat(roundtrippedProperty).isEqualTo(property)
    }
}

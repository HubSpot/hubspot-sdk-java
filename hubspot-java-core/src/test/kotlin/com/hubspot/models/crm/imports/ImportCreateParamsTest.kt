// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.imports

import com.hubspot.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImportCreateParamsTest {

    @Test
    fun create() {
        ImportCreateParams.builder()
            .files("Example data".byteInputStream())
            .importRequest("importRequest")
            .build()
    }

    @Test
    fun body() {
        val params =
            ImportCreateParams.builder()
                .files("Example data".byteInputStream())
                .importRequest("importRequest")
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "files" to MultipartField.of("Example data".byteInputStream()),
                        "importRequest" to MultipartField.of("importRequest"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ImportCreateParams.builder().build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() }).isEmpty()
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.events.definitions

import com.hubspot.core.AutoPager
import com.hubspot.core.Page
import com.hubspot.core.checkRequired
import com.hubspot.models.Paging
import com.hubspot.services.blocking.events.DefinitionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see DefinitionService.list */
class DefinitionListPage
private constructor(
    private val service: DefinitionService,
    private val params: DefinitionListParams,
    private val response: CollectionResponseWithTotalExternalBehavioralEventTypeDefinition,
) : Page<ExternalBehavioralEventTypeDefinition> {

    /**
     * Delegates to [CollectionResponseWithTotalExternalBehavioralEventTypeDefinition], but
     * gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalExternalBehavioralEventTypeDefinition.results
     */
    fun results(): List<ExternalBehavioralEventTypeDefinition> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalExternalBehavioralEventTypeDefinition], but
     * gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalExternalBehavioralEventTypeDefinition.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<ExternalBehavioralEventTypeDefinition> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): DefinitionListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): DefinitionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ExternalBehavioralEventTypeDefinition> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DefinitionListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalExternalBehavioralEventTypeDefinition = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DefinitionListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DefinitionListPage]. */
    class Builder internal constructor() {

        private var service: DefinitionService? = null
        private var params: DefinitionListParams? = null
        private var response: CollectionResponseWithTotalExternalBehavioralEventTypeDefinition? =
            null

        @JvmSynthetic
        internal fun from(definitionListPage: DefinitionListPage) = apply {
            service = definitionListPage.service
            params = definitionListPage.params
            response = definitionListPage.response
        }

        fun service(service: DefinitionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DefinitionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalExternalBehavioralEventTypeDefinition) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [DefinitionListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DefinitionListPage =
            DefinitionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DefinitionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "DefinitionListPage{service=$service, params=$params, response=$response}"
}

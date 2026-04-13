// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions.definitions

import com.hubspot.sdk.core.AutoPager
import com.hubspot.sdk.core.Page
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.ForwardPaging
import com.hubspot.sdk.models.automation.actions.CollectionResponsePublicActionDefinitionForwardPaging
import com.hubspot.sdk.models.automation.actions.PublicActionDefinition
import com.hubspot.sdk.services.blocking.automation.actions.DefinitionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see DefinitionService.list */
class DefinitionListPage
private constructor(
    private val service: DefinitionService,
    private val params: DefinitionListParams,
    private val response: CollectionResponsePublicActionDefinitionForwardPaging,
) : Page<PublicActionDefinition> {

    /**
     * Delegates to [CollectionResponsePublicActionDefinitionForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponsePublicActionDefinitionForwardPaging.results
     */
    fun results(): List<PublicActionDefinition> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponsePublicActionDefinitionForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponsePublicActionDefinitionForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<PublicActionDefinition> = results()

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

    fun autoPager(): AutoPager<PublicActionDefinition> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DefinitionListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponsePublicActionDefinitionForwardPaging = response

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
        private var response: CollectionResponsePublicActionDefinitionForwardPaging? = null

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
        fun response(response: CollectionResponsePublicActionDefinitionForwardPaging) = apply {
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

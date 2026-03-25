// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.blocking.automation.ActionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ActionService.list */
class ActionListPage
private constructor(
    private val service: ActionService,
    private val params: ActionListParams,
    private val response: CollectionResponsePublicActionRevisionForwardPaging,
) : Page<PublicActionRevision> {

    /**
     * Delegates to [CollectionResponsePublicActionRevisionForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponsePublicActionRevisionForwardPaging.results
     */
    fun results(): List<PublicActionRevision> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponsePublicActionRevisionForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponsePublicActionRevisionForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<PublicActionRevision> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): ActionListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): ActionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PublicActionRevision> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ActionListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponsePublicActionRevisionForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ActionListPage].
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

    /** A builder for [ActionListPage]. */
    class Builder internal constructor() {

        private var service: ActionService? = null
        private var params: ActionListParams? = null
        private var response: CollectionResponsePublicActionRevisionForwardPaging? = null

        @JvmSynthetic
        internal fun from(actionListPage: ActionListPage) = apply {
            service = actionListPage.service
            params = actionListPage.params
            response = actionListPage.response
        }

        fun service(service: ActionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ActionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponsePublicActionRevisionForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ActionListPage].
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
        fun build(): ActionListPage =
            ActionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "ActionListPage{service=$service, params=$params, response=$response}"
}

// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.automation.actions.revisions

import com.hubspot.core.AutoPager
import com.hubspot.core.Page
import com.hubspot.core.checkRequired
import com.hubspot.models.ForwardPaging
import com.hubspot.models.automation.actions.CollectionResponsePublicActionRevisionForwardPaging
import com.hubspot.models.automation.actions.PublicActionRevision
import com.hubspot.services.blocking.automation.actions.RevisionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see RevisionService.list */
class RevisionListPage
private constructor(
    private val service: RevisionService,
    private val params: RevisionListParams,
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

    fun nextPageParams(): RevisionListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): RevisionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PublicActionRevision> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RevisionListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponsePublicActionRevisionForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RevisionListPage].
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

    /** A builder for [RevisionListPage]. */
    class Builder internal constructor() {

        private var service: RevisionService? = null
        private var params: RevisionListParams? = null
        private var response: CollectionResponsePublicActionRevisionForwardPaging? = null

        @JvmSynthetic
        internal fun from(revisionListPage: RevisionListPage) = apply {
            service = revisionListPage.service
            params = revisionListPage.params
            response = revisionListPage.response
        }

        fun service(service: RevisionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RevisionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponsePublicActionRevisionForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [RevisionListPage].
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
        fun build(): RevisionListPage =
            RevisionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RevisionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "RevisionListPage{service=$service, params=$params, response=$response}"
}

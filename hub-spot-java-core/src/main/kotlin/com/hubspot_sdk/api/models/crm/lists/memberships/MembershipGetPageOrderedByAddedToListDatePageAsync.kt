// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists.memberships

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.crm.lists.ApiCollectionResponseJoinTimeAndRecordId
import com.hubspot_sdk.api.models.crm.lists.JoinTimeAndRecordId
import com.hubspot_sdk.api.models.marketing.emails.Paging
import com.hubspot_sdk.api.services.async.crm.lists.MembershipServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see MembershipServiceAsync.getPageOrderedByAddedToListDate */
class MembershipGetPageOrderedByAddedToListDatePageAsync
private constructor(
    private val service: MembershipServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MembershipGetPageOrderedByAddedToListDateParams,
    private val response: ApiCollectionResponseJoinTimeAndRecordId,
) : PageAsync<JoinTimeAndRecordId> {

    /**
     * Delegates to [ApiCollectionResponseJoinTimeAndRecordId], but gracefully handles missing data.
     *
     * @see ApiCollectionResponseJoinTimeAndRecordId.results
     */
    fun results(): List<JoinTimeAndRecordId> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [ApiCollectionResponseJoinTimeAndRecordId], but gracefully handles missing data.
     *
     * @see ApiCollectionResponseJoinTimeAndRecordId.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<JoinTimeAndRecordId> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                ._after()
                .getOptional("after")
                .isPresent

    fun nextPageParams(): MembershipGetPageOrderedByAddedToListDateParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                ._after()
                .getOptional("after")
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<MembershipGetPageOrderedByAddedToListDatePageAsync> =
        service.getPageOrderedByAddedToListDate(nextPageParams())

    fun autoPager(): AutoPagerAsync<JoinTimeAndRecordId> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MembershipGetPageOrderedByAddedToListDateParams = params

    /** The response that this page was parsed from. */
    fun response(): ApiCollectionResponseJoinTimeAndRecordId = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MembershipGetPageOrderedByAddedToListDatePageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MembershipGetPageOrderedByAddedToListDatePageAsync]. */
    class Builder internal constructor() {

        private var service: MembershipServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MembershipGetPageOrderedByAddedToListDateParams? = null
        private var response: ApiCollectionResponseJoinTimeAndRecordId? = null

        @JvmSynthetic
        internal fun from(
            membershipGetPageOrderedByAddedToListDatePageAsync:
                MembershipGetPageOrderedByAddedToListDatePageAsync
        ) = apply {
            service = membershipGetPageOrderedByAddedToListDatePageAsync.service
            streamHandlerExecutor =
                membershipGetPageOrderedByAddedToListDatePageAsync.streamHandlerExecutor
            params = membershipGetPageOrderedByAddedToListDatePageAsync.params
            response = membershipGetPageOrderedByAddedToListDatePageAsync.response
        }

        fun service(service: MembershipServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MembershipGetPageOrderedByAddedToListDateParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: ApiCollectionResponseJoinTimeAndRecordId) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MembershipGetPageOrderedByAddedToListDatePageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MembershipGetPageOrderedByAddedToListDatePageAsync =
            MembershipGetPageOrderedByAddedToListDatePageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MembershipGetPageOrderedByAddedToListDatePageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MembershipGetPageOrderedByAddedToListDatePageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}

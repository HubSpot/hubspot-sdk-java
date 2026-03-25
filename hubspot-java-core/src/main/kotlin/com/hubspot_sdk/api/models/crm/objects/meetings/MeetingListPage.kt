// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.meetings

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.crm.objects.CollectionResponseSimplePublicObjectWithAssociationsForwardPaging
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.services.blocking.crm.objects.MeetingService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see MeetingService.list */
class MeetingListPage
private constructor(
    private val service: MeetingService,
    private val params: MeetingListParams,
    private val response: CollectionResponseSimplePublicObjectWithAssociationsForwardPaging,
) : Page<SimplePublicObjectWithAssociations> {

    /**
     * Delegates to [CollectionResponseSimplePublicObjectWithAssociationsForwardPaging], but
     * gracefully handles missing data.
     *
     * @see CollectionResponseSimplePublicObjectWithAssociationsForwardPaging.results
     */
    fun results(): List<SimplePublicObjectWithAssociations> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseSimplePublicObjectWithAssociationsForwardPaging], but
     * gracefully handles missing data.
     *
     * @see CollectionResponseSimplePublicObjectWithAssociationsForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<SimplePublicObjectWithAssociations> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): MeetingListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): MeetingListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SimplePublicObjectWithAssociations> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MeetingListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseSimplePublicObjectWithAssociationsForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MeetingListPage].
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

    /** A builder for [MeetingListPage]. */
    class Builder internal constructor() {

        private var service: MeetingService? = null
        private var params: MeetingListParams? = null
        private var response: CollectionResponseSimplePublicObjectWithAssociationsForwardPaging? =
            null

        @JvmSynthetic
        internal fun from(meetingListPage: MeetingListPage) = apply {
            service = meetingListPage.service
            params = meetingListPage.params
            response = meetingListPage.response
        }

        fun service(service: MeetingService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MeetingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseSimplePublicObjectWithAssociationsForwardPaging) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [MeetingListPage].
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
        fun build(): MeetingListPage =
            MeetingListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MeetingListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MeetingListPage{service=$service, params=$params, response=$response}"
}
